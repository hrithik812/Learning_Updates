//Get random number 


function getRndInteger(min,max){
    return Math.floor(Math.random()*(max-min+1))+min;
}


console.log(getRndInteger(1,6));
function countVowels(sentence){

    let sentenceArray=Array.from(sentence);
    let count=0;
    let vowelsArray=["A","E","I","O","U","a","e","i","o","u"];
    sentenceArray.forEach((value)=>{
        if(vowelsArray.includes(value))
        {
            count++;
        }
    })
   return count;
}

console.log(countVowels("I love banglades"));