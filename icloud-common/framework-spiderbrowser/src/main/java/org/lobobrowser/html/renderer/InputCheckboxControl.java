/*
    GNU LESSER GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The Lobo Project

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: xamjadmin@users.sourceforge.net
*/
/*
 * Created on Jan 15, 2006
 */
package org.lobobrowser.html.renderer;

import javax.swing.JCheckBox;

import org.lobobrowser.html.domimpl.HTMLBaseInputElement;
import org.lobobrowser.util.gui.WrapperLayout;

class InputCheckboxControl extends BaseInputControl {
	private final JCheckBox widget; 
	
	public InputCheckboxControl(HTMLBaseInputElement modelNode) {
		super(modelNode);
		this.setLayout(WrapperLayout.getInstance());
		JCheckBox checkBox = new JCheckBox();
		checkBox.setOpaque(false);
		this.widget = checkBox; 
		this.add(checkBox);
	}	
	
	public void reset(int availWidth, int availHeight) {
		super.reset(availWidth, availHeight);
		String checkedText = this.controlElement.getAttribute("checked");
		this.widget.setSelected("checked".equalsIgnoreCase(checkedText));
	}
	
	/* (non-Javadoc)
	 * @see org.xamjwg.html.domimpl.InputContext#click()
	 */
	public void click() {
		this.widget.doClick();
	}

	/* (non-Javadoc)
	 * @see org.xamjwg.html.domimpl.InputContext#getChecked()
	 */
	public boolean getChecked() {
		return this.widget.isSelected();
	}

	/* (non-Javadoc)
	 * @see org.xamjwg.html.domimpl.InputContext#setChecked(boolean)
	 */
	public void setChecked(boolean checked) {
		this.widget.setSelected(checked);
	}

	/* (non-Javadoc)
	 * @see org.xamjwg.html.domimpl.InputContext#setDisabled(boolean)
	 */
	public void setDisabled(boolean disabled) {
		super.setDisabled(disabled);
		this.widget.setEnabled(!disabled);
	}
	
	public void resetInput() {
		String checkedText = this.controlElement.getAttribute("checked");
		this.widget.setSelected("checked".equalsIgnoreCase(checkedText));		
	}
	
	public String getValue() {
		return this.controlElement.getAttribute("value");
	}
}
