const carre = (nombre) => {
    const nombre1 = nombre.toString();
    const array = nombre1.split("");
    const fin = array.map(element => {
        return (parseInt(element) * parseInt(element)).toString()});
    return fin.join("");
}

console.log(carre(7478578))