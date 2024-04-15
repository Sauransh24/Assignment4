import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv("benchmark_results.csv")

pivot_data = data.pivot(index='Operation', columns='DataStructure', values='Time(ns)')

pivot_data.plot(kind='bar')
plt.title('Performance Comparison of HashTable vs BalancedTree')
plt.ylabel('Time (ns)')
plt.xlabel('Operation')
plt.yscale('log') 
plt.xticks(rotation=0)
plt.legend(title='Data Structure')
plt.tight_layout()
plt.savefig('performance_comparison.png')
plt.show()
