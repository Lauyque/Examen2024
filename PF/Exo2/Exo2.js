const list1 = [
    {
        FirstName: 'Noah', lastName: 'M.', pays: 'Suisse', continent: 'Europe', age: 19, langue: 'C',
        Repas: 'végétarien'
    },
    {
        FirstName: 'Anna', lastName: 'R.', pays: 'Liechtenstein', continent: 'Europe', age: 52, langue:
            'JavaScript',
        Repas: 'standard'
    },
    {
        FirstName: 'Ramona', lastName: 'R.', pays: 'Paraguay', continent: 'Amériques', age: 29, langue: 'Ruby',
        Repas: 'vegan'
    },
    {
        FirstName: 'George', lastName: 'B.', pays: 'Angleterre', continent: 'Europe', age: 81, langue: 'C',
        Repas: 'végétarien'
    },
];

const meeting = (list1) => {
    const tousRepas = list1.reduce((accumulator, currentValue) => {
        const a = currentValue.Repas;
        if (accumulator[a]) {
            accumulator[a]++;
        } else {
            accumulator[a] = 1;
        }
        return accumulator;
    }, {});

    return tousRepas;
}


console.log(meeting(list1))