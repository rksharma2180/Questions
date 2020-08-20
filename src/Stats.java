/*
package HE;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Stats {
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {

		Map<String, List<Double>> symbolPrice = new HashMap<>(10);

		@Override
		public void putNewPrice(String symbol, double price) {
			if (symbolPrice.containsKey(symbol)){
				if(symbolPrice.get(symbol) != null) {
					symbolPrice.get(symbol).add(price);
				}
			} else {
				symbolPrice.put(symbol, new ArrayList<Double>(Collections.singletonList(price)));
			}
		}

		@Override
		public double getAveragePrice(String symbol) {
			if(symbolPrice.get(symbol) != null) {
				return symbolPrice.get(symbol).stream().mapToDouble(Double::doubleValue).average().getAsDouble();
			}
			return 0;
		}

		@Override
		public int getTickCount(String symbol) {
			if(symbolPrice.containsKey(symbol)) {
				return symbolPrice.get(symbol).size();
			}
			return 0;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}*/
