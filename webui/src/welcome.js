export class Welcome {
  constructor(){
    this.heading = 'Welcome to the Aurelia Navigation App!';
    this.firstName = 'Nori';
    this.lastName = 'Matsu';
  }

  get fullName(){
    return `${this.firstName} ${this.lastName}`;
  }

  welcome(){
    alert(`Welcome, ${this.fullName}!`);
  }
}
