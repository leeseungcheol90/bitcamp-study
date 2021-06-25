package com.eomcs;

public class ArrayList {

  static final int MAX_LENGTH = 100;
  Object[] list = new Object[MAX_LENGTH];
  int size = 0;

  void append(Object obj) {
    list[size++]=obj;
  }

  Object[] toArray() {
    Object[] arr = new Object[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }

  Object retrieve(int index) {
    return list[index];
  }

  void remove(int index) {
    for (int i = index; i < size - 1; i++) {
      list[i] = list[i + 1];
    }
    size--;
  }

}