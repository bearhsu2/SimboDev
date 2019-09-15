const Tennis = require('./Tennis');

let tennis;

beforeEach(() => {
    tennis = new Tennis();
});

test('When Initial Then Love All', () => {
    checkScore('Love All');
});


test('When a Then Fifteen Love', () => {
    aScore(1);
    checkScore('Fifteen Love');
});

test('When aa Then Thirty Love', () => {
    aScore(2);
    checkScore('Thirty Love');
});

test('When aaa Then Forty Love', () => {
    aScore(3);
    checkScore('Forty Love');
});


test('When b Then Love Fifteen', () => {
    bScore(1);
    checkScore('Love Fifteen');
});

test('When bb Then Love Thirty', () => {
    bScore(2);
    checkScore('Love Thirty');
});


test('When ab Then Fifteen All', () => {
    aScore(1);
    bScore(1);
    checkScore('Fifteen All');
});

test('When aaabbb Then Deuce', () => {
    aScore(3);
    bScore(3);
    checkScore('Deuce');
});

test('When aaabbba Then Tom Adv.', () => {
    aScore(3);
    bScore(3);
    aScore(1);
    checkScore('Tom Adv.');
});

function checkScore(expected) {
    expect(tennis.score()).toBe(expected);
}

function aScore(times) {
    for (let i = 0; i < times; i++) {
        tennis.a();
    }
}

function bScore(times) {
    for (let i = 0; i < times; i++) {
        tennis.b();
    }
}

