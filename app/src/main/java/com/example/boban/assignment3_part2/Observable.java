package com.example.boban.assignment3_part2;

public interface Observable {
	void notifyListeners();
	void registerObserver(Observer obs);
}
