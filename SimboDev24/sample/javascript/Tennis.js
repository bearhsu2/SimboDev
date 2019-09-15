const scoreToPrintName = new Map();

scoreToPrintName.set(0, "Love");
scoreToPrintName.set(1, "Fifteen");
scoreToPrintName.set(2, 'Thirty');
scoreToPrintName.set(3, 'Forty');

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

        if (this.aScore === this.bScore) {
            return scoreToPrintName.get(this.aScore) + ' All';
        } else {
            return scoreToPrintName.get(this.aScore) + ' ' + scoreToPrintName.get(this.bScore);


        }

    }


}

module.exports = Tennis;
