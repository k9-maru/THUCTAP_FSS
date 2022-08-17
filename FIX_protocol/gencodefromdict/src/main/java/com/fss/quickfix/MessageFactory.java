/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package com.fss.quickfix;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case com.fss.quickfix.Heartbeat.MSGTYPE:
				return new com.fss.quickfix.Heartbeat();
	
			case com.fss.quickfix.Logon.MSGTYPE:
				return new com.fss.quickfix.Logon();
	
			case com.fss.quickfix.AutionMatch.MSGTYPE:
				return new com.fss.quickfix.AutionMatch();
	
			case com.fss.quickfix.BoardInfo.MSGTYPE:
				return new com.fss.quickfix.BoardInfo();
	
			case com.fss.quickfix.DerivativesInfo.MSGTYPE:
				return new com.fss.quickfix.DerivativesInfo();
	
			case com.fss.quickfix.Index.MSGTYPE:
				return new com.fss.quickfix.Index();
	
			case com.fss.quickfix.Stock.MSGTYPE:
				return new com.fss.quickfix.Stock();
	
			case com.fss.quickfix.StockInfo.MSGTYPE:
				return new com.fss.quickfix.StockInfo();
	
			case com.fss.quickfix.TopNPrice.MSGTYPE:
				return new com.fss.quickfix.TopNPrice();
	
			case com.fss.quickfix.TopPriceOddLot.MSGTYPE:
				return new com.fss.quickfix.TopPriceOddLot();
	
		}

		return new com.fss.quickfix.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case com.fss.quickfix.TopNPrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.field.NoTopPrice.FIELD:
					return new com.fss.quickfix.TopNPrice.NoTopPrice();
	
				}
				break;
	
		}

		return null;
	}
}
