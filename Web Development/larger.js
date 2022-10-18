var read=require('readline-sync')
num1=read.question('Enter two numbers')
num2=read.question('')
if(num1>num2)
{
    console.log('larger number is'+num1)
}
else if(num1===num2)
{
    console.log('both are same')
}
else
{
    console.log('larger number is'+num2)
}
