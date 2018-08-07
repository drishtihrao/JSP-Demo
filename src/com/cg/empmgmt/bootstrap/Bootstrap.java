package com.cg.empmgmt.bootstrap;

import java.io.IOException;

import com.cg.empmgmt.ui.UserInterface;

public class Bootstrap {
	public static void main(String[] args) {
		try {
			new UserInterface().start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
