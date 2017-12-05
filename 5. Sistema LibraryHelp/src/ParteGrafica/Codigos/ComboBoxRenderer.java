package ParteGrafica.Codigos;

/**
 *
 * @author Mathews
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;

public class ComboBoxRenderer extends BasicComboBoxRenderer{
	private String prompt;

	/*
	 * Texto quando nao tem nenhum item selecionado
	 */
	public ComboBoxRenderer(String prompt) {
		this.prompt = prompt;
	}

	/*
	 * mostra um item nao selecionavel quando nao ha nenhum item selecionado
	 */
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

		if (value == null)
			setText(prompt);

		return this;
	}
}
