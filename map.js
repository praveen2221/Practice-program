const numbers = [4, 9, 16, 25];
const arrays=numbers.map(Math.sqrt);
console.log(arrays);

function check(value){

return value>=10;
}
console.log(numbers.filter(check));
 