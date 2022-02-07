//Outer scope
//Global object from which every line of code executes
console.log(this);
//Global object is windows
//this basicallly refers to the current object
//When we are consider function,we are actually this refers to the calling object

function fn(){
    console.log(this);//as no calling object is here so it will print windows

    function abc(){
        console.log(this);
    }
    //Here we are getting this as global
    let ret=abc.bind(this);
    ret();
}

//3rd case

let obj={
    name:"Udai",
    func:fn
}
obj.func();


//to resolve this problem
//Method 1:Using bind()
//bind will extract the object defintion and will bind this
