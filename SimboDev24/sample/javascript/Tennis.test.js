const Tennis = require('./Tennis');


let tennis;

beforeEach(() => {
    tennis = new Tennis();
});

test('When Initial Then Love All', () => {
    checkScore('Love All');
});

test('When a Then Fifteen Love', () => {
    tennis.a();
    checkScore('Fifteen Love');
});

function checkScore(expected) {
    expect(tennis.score()).toBe(expected);
}
