package studentski.servis.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Document {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@ManyToMany
//	@JoinTable(name = "document_types",
//            joinColumns = @JoinColumn(name="document_id", referencedColumnName="id"),
//            inverseJoinColumns = @JoinColumn(name="doc_type_id", referencedColumnName="id"))
//	private Set<DocumentType> document_types = new HashSet<DocumentType>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private DocumentType document_types;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private Student student;


	public Document(Long id, DocumentType documentType, Student student) {
		super();
		this.id = id;
		this.document_types = documentType;
		this.student = student;
	}


	public Document() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public DocumentType getDocumentType() {
		return document_types;
	}


	public void setDocumentType(DocumentType documentType) {
		this.document_types = documentType;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
