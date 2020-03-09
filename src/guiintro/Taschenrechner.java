package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Taschenrechner {
	private static Text text;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(362, 384);
		shell.setText("SWT Application");
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_9.setBounds(57, 169, 44, 25);
		button_9.setText("9");
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_6.setBounds(57, 200, 44, 25);
		button_6.setText("6");
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_3.setBounds(57, 231, 44, 25);
		button_3.setText("3");
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_8.setBounds(107, 169, 44, 25);
		button_8.setText("8");
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_5.setBounds(107, 200, 44, 25);
		button_5.setText("5");
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_2.setBounds(107, 231, 44, 25);
		button_2.setText("2");
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_7.setBounds(157, 169, 44, 25);
		button_7.setText("7");
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_4.setBounds(157, 200, 44, 25);
		button_4.setText("4");
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_1.setBounds(157, 231, 44, 25);
		button_1.setText("1");
		
		Button button_0 = new Button(shell, SWT.NONE);
		button_0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_0.setBounds(57, 262, 94, 25);
		button_0.setText("0");
		
		Button newButton_1 = new Button(shell, SWT.NONE);
		newButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		newButton_1.setBounds(157, 262, 44, 25);
		newButton_1.setText("=");
		
		Button newButton_2 = new Button(shell, SWT.NONE);
		newButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		newButton_2.setBounds(207, 169, 44, 25);
		newButton_2.setText("-");
		
		Button newButton_3 = new Button(shell, SWT.NONE);
		newButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		newButton_3.setBounds(207, 200, 44, 25);
		newButton_3.setText("+");
		
		Button newButton_4 = new Button(shell, SWT.NONE);
		newButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		newButton_4.setBounds(207, 231, 44, 25);
		newButton_4.setText("/");
		
		Button newButton_5 = new Button(shell, SWT.NONE);
		newButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		newButton_5.setBounds(207, 262, 44, 25);
		newButton_5.setText("*");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(54, 102, 197, 52);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
