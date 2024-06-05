const longestWord = (mot) => {
    const array = mot.split(" ");
    const initialValue = "";
    const sumWithInitial = array.reduce(
        (accumulator, currentValue) => { if (accumulator.length <= currentValue.length) { return currentValue } else { return accumulator } },
        initialValue,
    );
    return sumWithInitial
}


console.log(longestWord('a b c d e fgh'))
console.log(longestWord('one two three'))
console.log(longestWord('red blue grey'))