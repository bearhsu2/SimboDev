const Tennis = require('./Tennis');


let tennis;

beforeEach(() => {
    tennis = new Tennis();
});

test('When Initial Then Love All', () => {
    expect(tennis.score()).toBe('Love All');
});

test('When a Then Fifteen Love', () => {
    tennis.a();
    expect(tennis.score()).toBe('Fifteen Love');
});
