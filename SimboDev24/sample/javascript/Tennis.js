const myMap = new Map();

myMap.set(0, "Love");
myMap.set(1, "Fifteen");
myMap.set(2, 'Thirty');
myMap.set(3, 'Forty');

class Tennis {
    constructor() {
        this.aScore = 0;
        this.bScore = 0;
    }

    a() {
        this.aScore += 1;
    }

    b() {
        this.bScore += 1;
    }

    score() {

        if (this.aScore == this.bScore) {
            return myMap.get(this.aScore) + ' All';
        } else {
            return myMap.get(this.aScore) + ' ' + myMap.get(this.bScore);


        }

    }


}

module.exports = Tennis;
