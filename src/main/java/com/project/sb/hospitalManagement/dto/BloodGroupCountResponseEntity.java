package com.project.sb.hospitalManagement.dto;

import com.project.sb.hospitalManagement.entity.type.BloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountResponseEntity {

    private BloodGroupType bloodGroupType;
    private Long count;
}
