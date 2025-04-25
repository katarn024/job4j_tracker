package ru.job4j.except;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.*;

class CountTest {

    @Test
    void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Count.add(10, 2);
                });
        /* ����� ��������� ����������� � ����������� ��� ���������� ������������ ����� assertThrows(),
        � �������� ������� ��������� �� ��������� ����� ����������, ������� �� ������� ��������
        � ���������� ���������� ������ ����. � �������� ������� ��������� �� �������� ���, ��� ���������� ��������
        ����� ������������� ����������. ��� ���� �������� �� ��� � ���� ������-���������, ������� ���������
        ����������� ����� ��������������� ���������� Executable.*/
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish");
    }

    @Test
    void whenException2() {
        int start = 0;
        int finish = 3;
        int expected = 3;
        int result = Count.add(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}
