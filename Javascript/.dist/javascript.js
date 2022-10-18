//Rest
// const globalPlayer=['Rahul','ajay','sunil']
// console.log(globalPlayer[0]);
// const [a,b,c]=globalPlayer;//array destructuring
// console.log(a);

// const playerDtls={
//     id:1,
//     name:"Arun",
//     type:"cricket"
// };
// const{id, ...rest}=playerDtls;
// console.log(id);
// console.log(rest);

//Arrow
// function myFunc()
// {
//     console.log("Running");
// }

// const myFunc=()=>console.log("Running")//function can be written like this
// myFunc()
// const sum=(value)=> { return value+5}//function passing value


// console.log(sum(10))

const listPlayers=[{
    id:1,
    name:"Aswin",
    age:23
},
{
    id:2,
    name:"Theertha",
    age:22
}
,{
    id:3,
    name:"alaka",
    age:24
}]

// for(let i=0;i<listPlayers.length;i++)
// {
//     console.log(listPlayers[i].name);
// }

//foreach ,map,filter refer
// listPlayers.forEach((value,index,array)=>
// {console.log(value)})
// listPlayers.forEach((value,index,array)=>{console.log(value)})

//Map method
//const newArray=listPlayers.map((value)=>{console.log(value)})

const exArray=[];
for(let i=0;i<listPlayers.length;i++)
{exArray.push(listPlayers[i])}
console.log(exArray);
const newArray=listPlayers.map((value)=>