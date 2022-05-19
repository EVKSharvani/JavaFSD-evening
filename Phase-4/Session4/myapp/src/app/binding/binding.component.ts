import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
name:string="Sharvani";
url:string="https://www.google.com";
imageUrl:string="./assets/1.jpg.jpeg";
we:number=700;
flag=false;

  show(){
    this.flag=!this.flag;
  }
products=[{name:"pencile",price:"8.3",available:"06-05-2022",ratings:4.8},
            {name:"pen",price:"10",available:"10-05-2022",ratings:4.8},
            {name:"eraser",price:"5.5",available:"06-06-2022",ratings:4.8},
            {name:"scale",price:"8",available:"19-05-2022",ratings:4.8},
            {name:"strencil",price:"15",available:"31-05-2022",ratings:4.8},
            ]
}
