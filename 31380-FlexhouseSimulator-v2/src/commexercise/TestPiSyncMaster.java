package commexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import commexercise.rpc.RpcClient;
import commexercise.rpc.RpcClientImpl;

public class TestPiSyncMaster {

	@Test
	public void test() throws Exception {

		int iterations = 1000;

		RpcClient client = new RpcClientImpl("http://localhost:8080");
		// do synchronous call to server

		System.out.println("Asking slave to calculate pi with " + iterations + " iterations.");

		String[] reply = client.callSync(TestPiSlave.PIFUNCTION, new String[] { Integer.toString(iterations) });
		double approximation = Double.valueOf(reply[0]).doubleValue();

		System.out.printf("The pi approximation is %f%n", approximation);
		assertEquals(3.14, approximation, 0.005);

	}
}
