const calculateTip = (prix, eval) => {
    const evaluation = eval.toLowerCase()
    switch (evaluation) {
        case "terrible":
            return 0
        case "poor":
            return Math.round((5 * prix) / 100)
        case "good":
            return Math.round((10 * prix) / 100)
        case "great":
            return Math.round((15 * prix) / 100)
        case "excellent":
            return Math.round((20 * prix) / 100)
        default:
            return "Rating not recognised"
    }
}

console.log(calculateTip(20, "Terrible"))
console.log(calculateTip(26.95, "goOd"))
console.log(calculateTip(20, "hi"))