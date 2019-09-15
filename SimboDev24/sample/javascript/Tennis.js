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

        if (this.aScore > 0 || this.bScore > 0) {
            return myMap.get(this.aScore) + ' ' + myMap.get(this.bScore);
        }


        return 'Love All';
    }


}

module.exports = Tennis;
