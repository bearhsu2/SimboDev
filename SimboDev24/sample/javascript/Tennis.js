const myMap = new Map();

myMap.set(1, "Fifteen");
myMap.set(2, 'Thirty');
myMap.set(3, 'Forty');

class Tennis {
    constructor() {
        this.aScore = 0;
    }

    a() {
        this.aScore += 1;
    }

    score() {

        if (this.aScore > 0) {
            return myMap.get(this.aScore) + ' Love';
        }

        return 'Love All';
    }


}

module.exports = Tennis;
