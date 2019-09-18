var myMap = new Map();

myMap.set(1, "Fifteen");
myMap.set(2, "Thirty");

function Tennis() {


    this.aHits = 0;

    this.a = function () {
        this.aHits++;
    };

    this.score = function () {

        if (this.aHits > 0) {
            return myMap.get(this.aHits) + ' Love';
        }


        return 'Love All';
    }

}


module.exports = Tennis;