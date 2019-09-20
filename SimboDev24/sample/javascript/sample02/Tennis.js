const hitsToScore = new Map();

hitsToScore.set(0, "Love");
hitsToScore.set(1, "Fifteen");
hitsToScore.set(2, "Thirty");
hitsToScore.set(3, "Forty");

function Tennis(aName, bName) {

    this.aName = aName;
    this.bName = bName;

    this.aHits = 0;
    this.bHits = 0;

    this.a = function () {
        this.aHits++;
    };

    this.b = function () {
        this.bHits++;
    };

    this.diffMoreThanOne = function () {
        return Math.abs(this.aHits - this.bHits) > 1;
    };

    this.sameScore = function () {
        return this.aHits === this.bHits;
    };

    this.afterDeuce = function () {

        return Math.max(this.aHits, this.bHits) > 3;
    };

    this.score = function () {


        if (this.sameScore()) {
            return this.aHits >= 3
                ? 'Deuce'
                : hitsToScore.get(this.aHits) + ' All';
        } else {
            if (this.afterDeuce()) {

                return this.leadingPlayer()
                    +
                    (this.diffMoreThanOne()
                        ? ' Wins'
                        : ' Adv.');

            } else {
                return hitsToScore.get(this.aHits) + ' ' + hitsToScore.get(this.bHits);
            }
        }


    };


    this.leadingPlayer = function () {
        return this.aHits > this.bHits
            ? this.aName
            : this.bName;
    }


}

module.exports = Tennis;