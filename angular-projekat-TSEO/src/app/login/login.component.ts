import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms';
import { LoginDto } from './dto/dto.component';
import {NgForm} from '@angular/forms';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: any;
  password: any;

  constructor(private LoginService: LoginService) { }

  ngOnInit() {
   // this.LoginService.getUsers().subscribe((student) => {
     // console.log(student);
   // })
  }



 

}
