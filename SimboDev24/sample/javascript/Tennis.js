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

    this.score = function () {


        if (this.aHits === this.bHits) {
            return this.aHits >= 3
                ? 'Deuce'
                : hitsToScore.get(this.aHits) + ' All';
        } else {

            if (Math.max(this.aHits, this.bHits) > 3) {

                return leadingPlayer.call(this) + ' Adv.';

            } else {
                return hitsToScore.get(this.aHits) + ' ' + hitsToScore.get(this.bHits);
            }
        }


    }


}

function leadingPlayer() {
    return this.aHits > this.bHits
        ? this.aName
        : this.bName;
}

module.exports = Tennis;
