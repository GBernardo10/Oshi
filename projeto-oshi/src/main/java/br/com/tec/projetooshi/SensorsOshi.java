package br.com.tec.projetooshi;

import java.util.Arrays;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;

public class SensorsOshi {

	SystemInfo si = new SystemInfo();
	HardwareAbstractionLayer hal = si.getHardware();
	Sensors sensors = new Sensors() {

		@Override
		public int[] getFanSpeeds() {
			int[] getFanSpe = hal.getSensors().getFanSpeeds();
			System.out.println(Arrays.toString(getFanSpe));
			// TODO Auto-generated method stub
			return getFanSpe;
		}

		@Override
		public double getCpuVoltage() {
			double getCpuVolt = hal.getSensors().getCpuVoltage();
			System.out.println(getCpuVolt);
			return getCpuVolt;
		}

		@Override
		public double getCpuTemperature() {
			double getCpuTemp = hal.getSensors().getCpuTemperature();
			System.out.println(getCpuTemp);
			return getCpuTemp;
		}
	};

}
