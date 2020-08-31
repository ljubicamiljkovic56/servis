import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { routing } from './app.routing';
import { HttpClientModule } from '@angular/common/http';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import 'rxjs/add/operator/map';

import { AppComponent } from './app.component';
import { StudentsComponent } from './students/students.component';
import { CoursesComponent } from './courses/courses.component';

import { StudentService } from './students/student.service';
import { CourseService } from './courses/course.service';
import { EnrollmentService } from './enrollments/enrollment.service';
import { StudentDetailComponent } from './student-detail/student-detail.component';
import { CourseDetailComponent } from './course-detail/course-detail.component';
import { EnrollmentDetailComponent } from './enrollment-detail/enrollment-detail.component';
import { LoginComponent } from './login/login.component';
import { MainComponent } from './login/main/main.component';
import { LoginService } from './login/login.service';
import { LoginDto } from './login/dto/dto.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentsComponent,
    CoursesComponent,
    StudentDetailComponent,
    CourseDetailComponent,
    EnrollmentDetailComponent,
    LoginComponent,
    MainComponent,
	LoginDto
  ],
  imports: [
    NgbModule.forRoot(),
    BrowserModule,
    FormsModule,
    HttpClientModule,
    routing
  ],
  providers: [StudentService, CourseService, EnrollmentService, LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
