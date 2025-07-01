package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
	public static void main(String[] args) {
		List<Attachment> attachments = Arrays.asList(
				new Attachment("image 1", 100),
				new Attachment("image 2", 34),
				new Attachment("image 3", 13)
		);

		Comparator<Attachment> comparatorSize = new Comparator<>() {
			@Override
			public int compare(Attachment o1, Attachment o2) {
				Attachment left = (Attachment) o1;
				Attachment right = (Attachment) o2;
				return Integer.compare(left.getSize(), right.getSize());
			}
		};

		attachments.sort(comparatorSize);
		System.out.println(attachments);

		Comparator<Attachment> comparatorName = new Comparator<Attachment>() {
			@Override
			public int compare(Attachment o1, Attachment o2) {
				Attachment left = (Attachment) o1;
				Attachment right = (Attachment) o2;
				return left.getName().compareTo(right.getName());
			}
		};

		attachments.sort(comparatorName);
		System.out.println(attachments);

		//Ниже просто код из урока
		Comparator<Attachment> comparatorText = (left, right) -> left.getName().compareTo(right.getName());

		ArrayList<Integer> list = new ArrayList<>() {
			@Override
			public boolean add(Integer o) {
				System.out.println("Add a new element to list: " + o);
				return super.add(o);
			}
		};
		list.add(100500);
	}
}
