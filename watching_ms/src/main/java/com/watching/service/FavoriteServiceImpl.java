package com.watching.service;

import java.util.List;

import javax.inject.Inject;

import com.watching.dao.FavoriteDAO;
import com.watching.dto.FavoriteDTO;

@Service
public class FavoriteServiceImpl implements FavoriteService {
	
	@Inject
	private FavoriteDAO fdao;


	@Override
	public List<FavoriteDTO> favlist(String mId) throws Exception {
		return fdao.favlist(mId);
	}

	@Override
	public void addfav(FavoriteDTO fdto) throws Exception {
		fdao.addfav(fdto);

	}

	@Override
	public void deletefav(int fCode) throws Exception {
		fdao.deletefav(fCode);

	}

}
