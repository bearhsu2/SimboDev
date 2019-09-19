const Tennis = require('./Tennis');


let tennis;

beforeEach(() => {
    tennis = new Tennis('Tom', 'Joe');
});

test('When Initial Then Love All', () => {
    expect(tennis.score()).toBe("Love All");
});
