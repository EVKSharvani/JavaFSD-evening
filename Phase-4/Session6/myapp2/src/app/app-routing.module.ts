import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { DemoComponent } from './demo/demo.component';
import { HomeComponent } from './home/home.component';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { UserComponent } from './user/user.component';
import { UserdemoComponent } from './userdemo/userdemo.component';
 

const routes: Routes = [
  //path to fredirect
  {"path":"home",component:HomeComponent},
  {"path":"about",component:AboutusComponent},
  {"path":"contact",component:ContactusComponent},
  {"path":"demo",component:DemoComponent},
  {"path":"pipe",component:PipedemoComponent},
  {"path":"user",component:UserComponent},
  {"path":"userdemo",component:UserdemoComponent},
   

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }