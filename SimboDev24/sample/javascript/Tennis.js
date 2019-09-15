const scoreToPrintName = new Map();

scoreToPrintName.set(0, "Love");
scoreToPrintName.set(1, "Fifteen");
scoreToPrintName.set(2, 'Thirty');
scoreToPrintName.set(3, 'Forty');

class Tennis {
    constructor(aName, bName) {
        this.aName = aName;
        this.bName = bName;
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

        if (this.sameScore()) {

            return this.aScore >= 3
                ? 'Deuce'
                : scoreToPrintName.get(this.aScore) + ' All';

        } else {

            if (this.afterDeuce()) {



                if (this.differenceIsOne()) {
                    return this.getLeadingPlayer() + ' Adv.';
                } else {
                    return this.getLeadingPlayer() + ' Wins';
                }

            } else {

                return scoreToPrintName.get(this.aScore) + ' ' + scoreToPrintName.get(this.bScore);
            }


        }

    }


    differenceIsOne() {
        return Math.abs(this.aScore - this.bScore) === 1;
    }

    getLeadingPlayer() {
        return this.aScore > this.bScore
            ? this.aName
            : this.bName;
    }

    sameScore() {
        return this.aScore === this.bScore;
    }

    afterDeuce() {
        return Math.max(this.aScore, this.bScore) > 3;
    }
}

module.exports = Tennis;
