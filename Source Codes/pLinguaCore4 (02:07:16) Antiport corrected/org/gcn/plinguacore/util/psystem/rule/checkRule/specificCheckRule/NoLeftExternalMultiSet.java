/* 
 * pLinguaCore: A JAVA library for Membrane Computing
 *              http://www.p-lingua.org
 *
 * Copyright (C) 2009  Research Group on Natural Computing
 *                     http://www.gcn.us.es
 *                      
 * This file is part of pLinguaCore.
 *
 * pLinguaCore is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * pLinguaCore is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with pLinguaCore.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.gcn.plinguacore.util.psystem.rule.checkRule.specificCheckRule;
import org.gcn.plinguacore.util.psystem.Psystem;
import org.gcn.plinguacore.util.psystem.rule.IRule;
import org.gcn.plinguacore.util.psystem.rule.checkRule.CheckRule;
import org.gcn.plinguacore.util.psystem.rule.checkRule.DecoratorCheckRule;

/**
 * This class tests if the outer multiset in the left hand of the rule is empty
 * (it has no objects)
 * 
 *  @author Research Group on Natural Computing (http://www.gcn.us.es)
 * 
 */
public class NoLeftExternalMultiSet extends DecoratorCheckRule {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2202497668908299011L;

	/**
	 * Creates a new NoLeftExternalMultiSet instance, which checks only the restrictions defined on itself.
	 */
	public NoLeftExternalMultiSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Creates a new NoLeftExternalMultiSet instance, which wraps cr as stated
	 * by Decorator pattern. Thus, it will be capable to test both the instance restrictions and cr restrictions 
	 * 
	 * @param cr
	 *            the CheckRule instance to be wrapped
	 */
	public NoLeftExternalMultiSet(CheckRule cr) {
		super(cr);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean checkSpecificPart(IRule r) {
		return r.getLeftHandRule().getMultiSet().isEmpty();

	}

	@Override
	protected String getSpecificCause() {
		// TODO Auto-generated method stub
		return "Rules with left-hand-rule external multiset are not allowed";
	}

}
