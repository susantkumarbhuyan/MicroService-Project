package com.skyline.pozo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	private long ratingId;
	private long userId;
	private long hotelId;
	private String rating;
	private String feedback;
	private Hotel hotel;
}
