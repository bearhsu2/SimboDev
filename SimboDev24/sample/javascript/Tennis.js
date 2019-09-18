const hitsToScore = new Map();

hitsToScore.set(0, "Love");
hitsToScore.set(1, "Fifteen");
hitsToScore.set(2, "Thirty");
hitsToScore.set(3, "Forty");

function Tennis() {

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

            if (this.aHits === 0) {
                return 'Love All';

            } else {
                return 'Fifteen All';
            }
        }

        if (this.aHits > 0 || this.bHits > 0) {
            return hitsToScore.get(this.aHits) + ' ' + hitsToScore.get(this.bHits);
        }

    }

}


module.exports = Tennis;