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
        this.aScore++;
    }

    b() {
        this.bScore++;
    }

    score() {

        if (this.aScore === this.bScore) {
            return this.aScore >= 3
                ? 'Deuce'
                : scoreToPrintName.get(this.aScore) + ' All';
        } else {
            return scoreToPrintName.get(this.aScore) + ' ' + scoreToPrintName.get(this.bScore);


        }

    }


}

module.exports = Tennis;
