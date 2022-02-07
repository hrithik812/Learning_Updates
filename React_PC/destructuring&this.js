let obj={
    name:"Hrithik",
    age:28,
    address:{
           state:101,
           pin:201
    }
}


//destructuring object attribute name,age


const {name:firstName,age}=obj;

console.log(firstName,age);

const {address:{state:stateCode}}=obj;
console.log(stateCode);


//this keyword

