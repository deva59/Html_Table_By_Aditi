const calculatorScreen = document.getElementById('screen');
const keys = document.querySelector('.calculator-keys');

keys.addEventListener('click', event => {
    const { target } = event;
    const { value } = target;

    if (!target.matches('button')) {
        return;
    }

    switch (value) {
        case '+':
        case '-':
        case '*':
        case '/':
        case '=':
            handleOperator(value);
            break;
        case 'clear':
            calculatorScreen.value = '';
            break;
        default:
            handleNumber(value);
            break;
    }
});

function handleNumber(value) {
    calculatorScreen.value += value;
}

function handleOperator(operator) {
    const currentValue = calculatorScreen.value;
    if (currentValue === '') return;

    if (operator === '=') {
        calculatorScreen.value = eval(currentValue);
    } else {
        calculatorScreen.value += operator;
    }
}