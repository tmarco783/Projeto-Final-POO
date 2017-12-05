package ParteGrafica;

/**
 *
 * @author Mathews
 */

import java.awt.Component;
import javax.swing.JList;
import javax.swing.plaf.basic.*;

public class MakeComboBoxRenderer extends BasicComboBoxRenderer{
    private String visual;
	/*
	 * Texto quando nao tem nenhum item selecionado
	 */
	public MakeComboBoxRenderer(String visual) {
		this.visual = visual;
	}

	/*
	 * mostra um item nao selecionavel quando nao ha nenhum item selecionado
	 */
    @Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

		if (value == null)
			setText(visual);

		return this;
	}
}
