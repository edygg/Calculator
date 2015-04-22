package org.example.calculator;

import java.util.Stack;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	// Components
	private TextView showOperation;
	private Button btnAc;
	private Button btnDel;
	private Button btnNumber1;
	private Button btnNumber2;
	private Button btnNumber3;
	private Button btnNumber4;
	private Button btnNumber5;
	private Button btnNumber6;
	private Button btnNumber7;
	private Button btnNumber8;
	private Button btnNumber9;
	private Button btnNumber0;
	private Button btnDot;
	private Button btnPlus;
	private Button btnMinus;
	private Button btnTimes;
	private Button btnDiv;
	private Button btnEquals;
	private Button btnPow;
	private Button btnSqrt;
	private Button btnInv;
	private Button btnPercentage;
	private Button btnFactorial;
	
	// Stack and control
	private Stack<Double> operands;
	private Character currentOperation;
	private boolean solved;
	
	// Initialize components
	private void initComponents() {
		this.showOperation = (TextView) this.findViewById(R.id.show_result);
		this.btnAc = (Button) this.findViewById(R.id.ac_btn);
		this.btnAc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnAcClicked(v);
			}
		});
		this.btnDel = (Button) this.findViewById(R.id.del_btn);
		this.btnDel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnDelClicked(v);
			}
		});
		this.btnNumber1 = (Button) this.findViewById(R.id.number_1_btn);
		this.btnNumber1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber1Clicked(v);
			}
		});
		this.btnNumber2 = (Button) this.findViewById(R.id.number_2_btn);
		this.btnNumber2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber2Clicked(v);
			}
		});
		this.btnNumber3 = (Button) this.findViewById(R.id.number_3_btn);
		this.btnNumber3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber3Clicked(v);
			}
		});
		this.btnNumber4 = (Button) this.findViewById(R.id.number_4_btn);
		this.btnNumber4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber4Clicked(v);
			}
		});
		this.btnNumber5 = (Button) this.findViewById(R.id.number_5_btn);
		this.btnNumber5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber5Clicked(v);
			}
		});
		this.btnNumber6 = (Button) this.findViewById(R.id.number_6_btn);
		this.btnNumber6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber6Clicked(v);
			}
		});
		this.btnNumber7 = (Button) this.findViewById(R.id.number_7_btn);
		this.btnNumber7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber7Clicked(v);
			}
		});
		this.btnNumber8 = (Button) this.findViewById(R.id.number_8_btn);
		this.btnNumber8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber8Clicked(v);
			}
		});
		this.btnNumber9 = (Button) this.findViewById(R.id.number_9_btn);
		this.btnNumber9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber9Clicked(v);
			}
		});
		this.btnNumber0 = (Button) this.findViewById(R.id.number_0_btn);
		this.btnNumber0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnNumber0Clicked(v);
			}
		});
		this.btnDot = (Button) this.findViewById(R.id.dot_btn);
		this.btnDot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnDotClicked(v);
			}
		});
		this.btnPlus = (Button) this.findViewById(R.id.plus_btn);
		this.btnPlus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnPlusClicked(v);
			}
		});
		this.btnMinus = (Button) this.findViewById(R.id.minus_btn);
		this.btnMinus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnMinusClicked(v);
			}
		});
		this.btnTimes = (Button) this.findViewById(R.id.times_btn);
		this.btnTimes.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnTimesClicked(v);
			}
		});
		this.btnDiv = (Button) this.findViewById(R.id.div_btn);
		this.btnDiv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnDivClicked(v);
			}
		});
		this.btnPow = (Button) this.findViewById(R.id.pow_btn);
		this.btnPow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnPowClicked(v);
			}
		});
		this.btnSqrt = (Button) this.findViewById(R.id.sqrt_btn);
		this.btnSqrt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnSqrtClicked(v);
			}
		});
		this.btnInv = (Button) this.findViewById(R.id.inv_btn);
		this.btnInv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnInvClicked(v);
			}
		});
		this.btnPercentage = (Button) this.findViewById(R.id.percentage_btn);
		this.btnPercentage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnPercentageClicked(v);
			}
		});
		this.btnFactorial = (Button) this.findViewById(R.id.factorial_btn);
		this.btnFactorial.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnFactorialClicked(v);
			}
		});
		this.btnEquals = (Button) this.findViewById(R.id.equals_btn);
		this.btnEquals.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				btnEqualsClicked(v);
			}
		});
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.operands = new Stack<Double>();
		initComponents();
		this.solved = false;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	// Events
	public void btnAcClicked(View v) {
		this.showOperation.setText("");
		operands.clear();
	}
	
	public void btnDelClicked(View v) {
		if (solved)
			return;
		String operation = this.showOperation.getText().toString();
		if (!operation.isEmpty())
			this.showOperation.setText(operation.subSequence(0, operation.length() - 1));
	}
	
	public void btnNumber1Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "1");
	}
	
	public void btnNumber2Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "2");
	}
	
	public void btnNumber3Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "3");
	}
	
	public void btnNumber4Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "4");
	}
	
	public void btnNumber5Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "5");
	}
	
	public void btnNumber6Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "6");
	}
	
	public void btnNumber7Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "7");
	}
	
	public void btnNumber8Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "8");
	}
	
	public void btnNumber9Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "9");
	}
	
	public void btnNumber0Clicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + "0");
	}
	
	public void btnDotClicked(View v) {
		if (solved) {
			this.showOperation.setText("");
			solved = false;
		}
		String operation = this.showOperation.getText().toString();
		this.showOperation.setText(operation + ".");
	}
	
	public void btnPlusClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				currentOperation = '+';
				solved = true;
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = '+';
				solved = true;
			}
		}
	}
	
	public void btnMinusClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				currentOperation = '-';
				solved = true;
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = '-';
				solved = true;
			}
		}
	}
	
	public void btnTimesClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				currentOperation = '*';
				solved = true;
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = '*';
				solved = true;
			}
		}
	}
	
	public void btnDivClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				currentOperation = '/';
				solved = true;
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = '/';
				solved = true;
			}
		}
	}
	
	public void btnEqualsClicked(View v) {
		if (!operands.isEmpty()) {
			if (insertNumber()) {
				solve();
				currentOperation = ' ';
				solved = true;
				operands.pop();
			}
		}
	}
	
	public void btnPowClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				operands.push(2.0);
				currentOperation = 'p';
				solve();
				solved = true;
				operands.pop();
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = 'p';
				operands.push(2.0);
				solve();
				solved = true;
				operands.pop();
			}
		}
	}
	
	public void btnSqrtClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				operands.push(0.5);
				currentOperation = 's';
				solve();
				solved = true;
				operands.pop();
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = 's';
				operands.push(0.5);
				solve();
				solved = true;
				operands.pop();
			}
		}
	}
	
	public void btnInvClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				operands.push(1.0);
				currentOperation = 'i';
				solve();
				solved = true;
				operands.pop();
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = 'i';
				operands.push(1.0);
				solve();
				solved = true;
				operands.pop();
			}
		}
	}
	
	public void btnPercentageClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				currentOperation = '%';
				solved = true;
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = '%';
				solved = true;
			}
		}
	}
	
	public void btnFactorialClicked(View v) {
		if (operands.isEmpty()) {
			if (insertNumber()) {
				operands.push(0.0);
				currentOperation = 'f';
				solve();
				solved = true;
				operands.pop();
			}
		} else {
			if (insertNumber()) {
				solve();
				currentOperation = 'f';
				operands.push(0.0);
				solve();
				solved = true;
				operands.pop();
			}
		}
	}
	
	public void solve() {
		Double operand2 = operands.pop();
		Double operand1 = operands.pop();
		switch (currentOperation) {
			case '+': {
				this.showOperation.setText(Double.toString(operand1 + operand2));
				operands.push(operand1 + operand2);
				break;
			}
			
			case '-': {
				this.showOperation.setText(Double.toString(operand1 - operand2));
				operands.push(operand1 - operand2);
				break;
			}
			
			case '*': {
				this.showOperation.setText(Double.toString(operand1 * operand2));
				operands.push(operand1 - operand2);
				break;
			}
			
			case '/': {
				this.showOperation.setText(Double.toString(operand1 / operand2));
				operands.push(operand1 - operand2);
				break;
			}
			
			case 'p': {
				this.showOperation.setText(Double.toString(Math.pow(operand1, operand2)));
				operands.push(Math.pow(operand1, operand2));
				break;
			}
			
			case 's': {
				this.showOperation.setText(Double.toString(Math.sqrt(operand1)));
				operands.push(Math.sqrt(operand1));
				break;
			}
			
			case 'i': {
				this.showOperation.setText(Double.toString(operand2 / operand1));
				operands.push(operand2 / operand1);
				break;
			}
			
			case '%': {
				this.showOperation.setText(Double.toString(operand1 * (operand2 / 100.0)));
				operands.push(operand1 * (operand2 / 100.0));
				break;
			}
			
			case 'f': {
				this.showOperation.setText(Double.toString(gamma(operand1 + 1.0)));
				operands.push(gamma(operand1 + 1.0));
				break;
			}
			
			default: {
				break;
			}
		}
	}
	
	public boolean insertNumber() {
		String operand = this.showOperation.getText().toString();
		try {
			Double number = Double.parseDouble(operand);
			operands.push(number);
			return true;
		} catch (NumberFormatException ex) {
			Toast.makeText(this, "Revise el número", Toast.LENGTH_LONG).show();
			return false;
		}
	}
	
	private double gamma(double x){
		double[] p = {0.99999999999980993, 676.5203681218851, -1259.1392167224028,
		     	  771.32342877765313, -176.61502916214059, 12.507343278686905,
		     	  -0.13857109526572012, 9.9843695780195716e-6, 1.5056327351493116e-7};
		int g = 7;
		if(x < 0.5) return Math.PI / (Math.sin(Math.PI * x)* gamma(1-x));
	
		x -= 1;
		double a = p[0];
		double t = x+g+0.5;
		for(int i = 1; i < p.length; i++){
			a += p[i]/(x+i);
		}
	
		return Math.sqrt(2*Math.PI)*Math.pow(t, x+0.5)*Math.exp(-t)*a;
	}
}
