const list = [
    [[123, 231, 12], [56, 43, 124]],
    [[78, 152, 76], [64, 132, 200]]
]

const gris = (list) => list.map(element => element.map(element1 =>
    [Math.round((element1[0] + element1[1] + element1[2]) / 3),
    Math.round((element1[0] + element1[1] + element1[2]) / 3),
    Math.round((element1[0] + element1[1] + element1[2]) / 3)]
))

console.log(gris(list))