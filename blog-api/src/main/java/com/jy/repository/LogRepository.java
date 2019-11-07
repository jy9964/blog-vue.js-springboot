package com.jy.repository;

import com.jy.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jy
 * <p>
 * 2019年11月8日
 */
public interface LogRepository extends JpaRepository<Log, Integer> {
}
