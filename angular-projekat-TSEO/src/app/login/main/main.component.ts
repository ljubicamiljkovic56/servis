import { Component, OnInit } from '@angular/core';
import { LoginDto } from '../dto/dto.component';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
  username: any;
  password: any;

  constructor(private loginService: LoginService) { }

  ngOnInit() {
  }

  Login() {
    const logindto = new LoginDto();
    logindto.username = this.username.value;
    logindto.password = this.password.value;
  }

}
