package com.coderising.download.api;

public interface DownloadListener {
	public void notifyFinished(boolean isFinish);
	public boolean getIsFinished();
}
