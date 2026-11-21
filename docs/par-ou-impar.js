const form = document.querySelector('#exercise');
const lowerInput = document.querySelector('#lower');
const upperInput = document.querySelector('#upper');
const status = document.querySelector('#status');
const output = document.querySelector('#numbers');

form.addEventListener('input', () => {
  upperInput.setCustomValidity('');
  output.hidden = true;
  status.textContent = 'Envie o formulário para atualizar o resultado.';
});

form.addEventListener('submit', (event) => {
  event.preventDefault();

  const lower = lowerInput.valueAsNumber;
  const upper = upperInput.valueAsNumber;
  const difference = upper - lower;

  if (difference <= 0 || difference > 1000) {
    const message = difference <= 0
      ? 'O segundo número deve ser maior que o primeiro.'
      : 'A diferença entre os números pode ser de até 1.000.';
    upperInput.setCustomValidity(message);
    upperInput.reportValidity();
    status.textContent = message;
    output.hidden = true;
    return;
  }

  const showEven = new FormData(form).get('parity') === 'even';
  const numbers = [];

  for (let number = upper; number >= lower; number--) {
    if ((number % 2 === 0) === showEven) {
      numbers.push(number);
    }
  }

  status.textContent = `Exibindo ${numbers.length} ${numbers.length === 1 ? 'número' : 'números'}.`;
  output.textContent = numbers.join(', ');
  output.hidden = false;
});
