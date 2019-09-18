const Tennis = require('./Tennis');


let tennis;

beforeEach(() => {
    tennis = new Tennis('Tom');
});

test('When Initial Then Love All', () => {
    checkScore('Love All');
});

test('When a Then Fifteen Love', () => {
    makeAHits(1);
    checkScore('Fifteen Love');
});

test('When aa Then Thirty Love', () => {

    makeAHits(2);
    checkScore('Thirty Love');
});

test('When aaa Then Forty Love', () => {

    makeAHits(3);
    checkScore('Forty Love');
});


test('When b Then Love Fifteen', () => {

    makeBHits(1);
    checkScore('Love Fifteen');
});

test('When bb Then Love Thirty', () => {

    makeBHits(2);
    checkScore('Love Thirty');
});

test('When ab Then Fifteen All', () => {

    makeAHits(1);
    makeBHits(1);
    checkScore('Fifteen All');
});

test('When aabb Then Thirty All', () => {

    makeAHits(2);
    makeBHits(2);
    checkScore('Thirty All');
});

test('When aaabbb Then Deuce', () => {
    makeDeuce();
    checkScore('Deuce');
});


test('When aaabbba A Adv', () => {
    makeDeuce();
    makeAHits(1);
    checkScore('Tom Adv.');
});

function makeDeuce() {
    makeAHits(3);
    makeBHits(3);

}

function makeAHits(times) {
    for (let i = 0; i < times; i++) {
        tennis.a();
    }
}

function makeBHits(times) {
    for (let i = 0; i < times; i++) {
        tennis.b();
    }
}

function checkScore(expected) {
    expect(tennis.score()).toBe(expected);
}
