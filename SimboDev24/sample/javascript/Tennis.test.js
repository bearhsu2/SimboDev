const Tennis = require('./Tennis');


test('When Initial Then Love All', () => {
    var tennis = new Tennis();
    expect(tennis.score()).toBe('Love All');

});
